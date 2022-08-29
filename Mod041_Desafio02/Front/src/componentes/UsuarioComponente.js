import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import UsuarioServicio from "../servicios/UsuarioServicio";
import {
    Table,
    Button,
    Container,
    Modal,
    ModalHeader,
    ModalBody,
    FormGroup,
    ModalFooter,
} from "reactstrap";



class UsuarioComponente extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            usuario: [],
            modalActualizar: false,
            modalInsertar: false,
            form: {
                id: "",
                nombre: "",
                apellido: "",
                correo:"",
            },
        }
    }
  
    componentDidMount(){
        UsuarioServicio.getUsuario().then((response)=>{
            this.setState({usuario:response.data})
        })
    }
    mostrarModalActualizar = (dato) => {
        this.setState({
            form: dato,
            modalActualizar: true,
        });
    };

    cerrarModalActualizar = () => {
        this.setState({ modalActualizar: false });
    };

    mostrarModalInsertar = () => {
        this.setState({
            modalInsertar: true,
        });
    };

    cerrarModalInsertar = () => {
        this.setState({ modalInsertar: false });
    };
   

    insertar = () => {
        var valorNuevo = { ...this.state.form };
        valorNuevo.id = this.state.usuario.length + 1;
        var lista = this.state.usuario;
        lista.push(valorNuevo);
        this.setState({ modalInsertar: false, usuario: lista });
        let usuario = {nombre:this.state.form.nombre,apellido:this.state.form.apellido,correo:this.state.form.correo};
        UsuarioServicio.crearUsuario(usuario).then((response)=>{
            console.log(response)
        })
    }
    eliminar =()=>{
        
    }
    handleChange = (e) => {
        this.setState({
            form: {
                ...this.state.form,
                [e.target.name]: e.target.value,
            },
        });
    };

    render() {

        return (
            <>
                <Container>
                    <br />
                    <Button color="success" onClick={() => this.mostrarModalInsertar()}>Crear</Button>
                    <br />
                    <br />
                    <Table>
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Correo</th>
                            </tr>
                        </thead>

                        <tbody>
                            {this.state.usuario.map((dato) => (
                                <tr key={dato.id}>
                                    <td>{dato.id}</td>
                                    <td>{dato.nombre}</td>
                                    <td>{dato.apellido}</td>
                                    <td>{dato.correo}</td>
                                    <td>
                                        <Button
                                            color="primary"
                                            onClick={() => this.mostrarModalActualizar(dato)}
                                        >
                                            Editar
                                        </Button>{" "}
                                        <Button color="danger" onClick={() => this.eliminar(dato)}>Eliminar</Button>
                                    </td>
                                </tr>
                            ))}
                        </tbody>
                    </Table>
                </Container>

                <Modal isOpen={this.state.modalActualizar}>
                    <ModalHeader>
                        <div><h3>Editar Registro</h3></div>
                    </ModalHeader>

                    <ModalBody>
                        <FormGroup>
                            <label>
                                Id:
                            </label>

                            <input
                                className="form-control"
                                readOnly
                                type="text"
                                value={this.state.form.id}
                            />
                        </FormGroup>

                        <FormGroup>
                            <label>
                                Nombre:
                            </label>
                            <input
                                className="form-control"
                                name="nombre"
                                type="text"
                                onChange={this.handleChange}
                                value={this.state.form.nombre}
                            />
                        </FormGroup>

                        <FormGroup>
                            <label>
                                Apellido:
                            </label>
                            <input
                                className="form-control"
                                name="apellido"
                                type="text"
                                onChange={this.handleChange}
                                value={this.state.form.apellido}
                            />
                        </FormGroup>
                        <FormGroup>
                            <label>
                                Correo:
                            </label>
                            <input
                                className="form-control"
                                name="correo"
                                type="text"
                                onChange={this.handleChange}
                                value={this.state.form.correo}
                            />
                        </FormGroup>
                    </ModalBody>

                    <ModalFooter>
                        <Button
                            color="primary"
                            onClick={() => this.editar(this.state.form)}
                        >
                            Editar
                        </Button>
                        <Button
                            color="danger"
                            onClick={() => this.cerrarModalActualizar()}
                        >
                            Cancelar
                        </Button>
                    </ModalFooter>
                </Modal>



                <Modal isOpen={this.state.modalInsertar}>
                    <ModalHeader>
                        <div><h3>Insertar Usuario</h3></div>
                    </ModalHeader>

                    <ModalBody>
                        <FormGroup>
                            <label>
                                Id:
                            </label>

                            <input
                                className="form-control"
                                readOnly
                                type="text"
                                value={this.state.usuario.length + 1}
                            />
                        </FormGroup>

                        <FormGroup>
                            <label>
                                Nombre:
                            </label>
                            <input
                                className="form-control"
                                name="nombre"
                                type="text"
                                onChange={this.handleChange}
                            />
                        </FormGroup>

                        <FormGroup>
                            <label>
                                Apellido:
                            </label>
                            <input
                                className="form-control"
                                name="apellido"
                                type="text"
                                onChange={this.handleChange}
                            />
                        </FormGroup>
                        <FormGroup>
                            <label>
                                Correo:
                            </label>
                            <input
                                className="form-control"
                                name="correo"
                                type="text"
                                onChange={this.handleChange}
                            />
                        </FormGroup>
                    </ModalBody>

                    <ModalFooter>
                        <Button
                            color="primary"
                            onClick={() => this.insertar()}
                        >
                            Insertar
                        </Button>
                        <Button
                            className="btn btn-danger"
                            onClick={() => this.cerrarModalInsertar()}
                        >
                            Cancelar
                        </Button>
                    </ModalFooter>
                </Modal>
            </>
        );
    }
}
export default UsuarioComponente;
