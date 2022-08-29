import axios from "axios";
const USUARIO_REST_API_URL = 'http://localhost:8080/api/usuario';


class UsuarioServicio {
    getUsuario() {
        return axios.get(USUARIO_REST_API_URL);
    }
    crearUsuario(usuario) {
        return axios.post(USUARIO_REST_API_URL, usuario);
    }
    borrarUsuario(usuarioId){
        return axios.delete(USUARIO_REST_API_URL+ '/' + usuarioId);
    }
    
}
export default new UsuarioServicio;