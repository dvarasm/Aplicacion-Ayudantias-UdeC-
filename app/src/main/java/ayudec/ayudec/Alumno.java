package ayudec.ayudec;

import java.math.BigInteger;

public class Alumno {


    private String _nombre, _user, _password, _matricula, _carrera, _correo, _telefono;
    private BigInteger _horario;

    public Alumno(String nombre, String user, String password, String matricula, String carrera, BigInteger horario){
        _nombre = nombre;
        _user = user;
        _password = password;
        _matricula = matricula;
        _carrera = carrera;
        _horario = horario;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_user() {
        return _user;
    }

    public void set_user(String _user) {
        this._user = _user;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_matricula() {
        return _matricula;
    }

    public void set_matricula(String _matricula) {
        this._matricula = _matricula;
    }

    public String get_carrera() {
        return _carrera;
    }

    public void set_carrera(String _carrera) {
        this._carrera = _carrera;
    }

    public BigInteger get_horario() {
        return _horario;
    }

    public void set_horario(BigInteger _horario) {
        this._horario= _horario;
    }

    public String get_correo() {
        return _correo;
    }

    public void set_correo(String _correo) {
        this._correo = _correo;
    }

    public String get_telefono() {
        return _telefono;
    }

    public void set_telefono(String _telefono) {
        this._telefono = _telefono;
    }
}
