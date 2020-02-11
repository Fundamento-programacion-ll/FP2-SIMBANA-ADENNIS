// var nombre = 'Paul nijhhb';
// console.log(nombre.length);
// console.log(nombre.indexOf('u'));

// console.log(nombre.search('ul'));
// console.log(nombre.substr(2));

// console.log(nombre.charCodeAt);


// var cadena = "Paul";
// var cadenarevertida = "";
   

// for(var i = cadena.length-1; i>=0; i--)
// {
  
//   cadenarevertida += cadena[i];
// }
// console.log(cadenarevertida);



// console.log(nombre.slice(1,6));
// //-----------------------------------------


// console.log(nombre.split(""));

// var texto = "hola que hace"
// console.log('antes de remplazar');
// console.log(texto);
// console.log('despues de reemplaxxar de remplazar');
// var textModificado = texto.replace("que","khe");



// console.log(textModificado);
// ///////////////////////////////////////////////////////////////////

// var ejemploTrin = "                        hola"
// console.log(ejemploTrin)
// console.log(ejemploTrin.trim());
// console.log(ejemploTrin.concat("",nombre));
// console.log(ejemploTrin.localeCompare('hola'));
// ejemploTrin===nombre
// console.log(ejemploTrin.toUpperCase());

//============================================================================================================================================

// * /
// / *
//Primera palabra mayúscula, inicio mitad final
//contar cuantos; o, o.
//espacion con * - *
//* /
/// *
//var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrador hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1 / 2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que se repite al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas 48 megapíxeles (con más detalle).
// * /

var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrador hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1 / 2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que se repite al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas 48 megapíxeles (con más detalle).';
var arregloNoticia = noticia.split(" ");
arregloNoticia[0] = arregloNoticia[0].toLocaleLowerCase();

var m1 =(arregloNoticia.length / 2)-0.5;
var m2 =(arregloNoticia.length / 2)+0.5;

arregloNoticia[m1]= arregloNoticia[m1].toLocaleUpperCase();
arregloNoticia[m2]= arregloNoticia[m2].toLocaleUpperCase();

var final = arregloNoticia.length;

arregloNoticia[final-1]=arregloNoticia[final-1].toLocaleUpperCase();

var contarp = noticia.split(".");
var contarc = noticia.split(",");

var Puntos = punto.length -1;
var Comas = comas.length -1;
 
var noticiaCompleta = '';

for(var i =0< arregloNoticia.length-1; i>=0; i++)
 {
  
   noticiaCompleta = noticiaCompleta + arregloNoticia[i]+"*_*";
 }

 console.log(noticiaCompleta);
 console.log("Numero de puntos:"+Puntos);
console.log("numero de compas:"+Comas);




