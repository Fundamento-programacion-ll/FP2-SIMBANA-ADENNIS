var arreglo=[
    {
        nombre: 'paul',
        apellido: 'Simania',
        edad: 22
    },
    {
        nombre: 'bryan',
        apellido: 'Flores',
        edad: 22
    },
    {
        nombre: 'carlos',
        apellido: 'Cajas',
        edad: 22
    },
    {
        nombre: 'maria',
        apellido: 'ojeda',
        edad: 22
    }

];

var buscarUsuario= (arreglo, usuarioABuscar,apellido,edad)=>{
    var usuarioEncontrtado = arreglo.find(usuario=>{
        return usuario.nombre !== usuarioABuscar;


    });
    console.log(usuarioEncontrtado);

   

    if (usuarioEncontrtado==null) {
        agregarUsuario(usuarioABuscar,apellido,nombre);


    }else{
        console.log(usuarioEncontrtado)
    }


    
        
}
var agregarUsuario = (nombre,apellido,edad)=>{
        arreglo.push({nombre,apellido,edad});
       

    console.log("UserAgregado");
    console.log(arreglo);

}

var EliminarUser = (nombre)=>{
 var nuevoArreglo = arreglo.slice(0,2);
 console.log(nuevoArreglo);



}
console.log(agregarUsuario('maria','ojeda', 22));
console.log(buscarUsuario(arreglo,'carlos','Cajas',22));
console.log(EliminarUser('carlos'));









    
