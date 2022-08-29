import React from "react";
export default class Main extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            datos: [],
            posts: []

        };
    }
    componentDidMount() {
        this.getPosts()
    }
    getPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(posts => this.setState({ posts }))
            .catch(error => console.log(error.message))
    }
    agregar = (e) => {
        e.preventDefault();
        //console.log(e.target);
        const inputs = document.querySelectorAll("input")
        var lista = [];
        inputs.forEach((item) => {
            console.log(item.value)
            lista = this.state.datos;
            lista.push(item.value + " ");
        })
        this.setState({
            datos: lista
        })
    }
    render() {
        const { posts } = this.state;
        return (
            <main>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis, esse ipsum ad magni aliquid dolores enim quibusdam perferendis odio suscipit voluptas delectus neque, nulla asperiores tempora! Beatae quas reprehenderit sequi?
                </p>
                <br /><hr /><br />
                <h2>formulario</h2>
                <form action="" method="post" id="form" onSubmit={this.agregar.bind(this)}>
                    <label htmlFor="nombre">Nombre: </label>
                    <input type="text" id="nombre" name="nombre" />
                    <label htmlFor="apellido">Apellido: </label>
                    <input type="text" id="apellido" name="apellido" />
                    <button>Enviar</button>
                </form>
                <br /><hr /><br />
                <h3>Consumiendo servicios web</h3>
                {this.state.datos.map((item) => {
                    return (
                        <>
                            {item}
                        </>
                    )
                })}
                <br /><hr /><br />
                <ul>
                    {posts.map(post => <li>{post.title}</li>)}
                </ul>

            </main>
        )
    }



}
