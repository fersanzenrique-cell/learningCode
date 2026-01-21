// Obtenemos un "HTMLCollection"
const elements = document.getElementsByTagName("div");
elements.constructor.name;  // "HTMLCollection"

// Reestructuramos y obtenemos un "Array"
const elements1 = [...document.getElementsByTagName("div")];
elements.constructor.name;     // "Array"

// Si intentas ejecutar un método .forEach(), .map(), .filter() o similar, sobre un  podrás hacerlo, 
// pero sobre un  obtendrás un error (no existen). 
// Para evitar este problema, podemos utilizar Array.from() o la reestructuración [...], y así convertirlo fácilmente en un  real.

// HTMLCollection
const collection = document.getElementsByTagName("div");
collection.length;        // 63
collection[62].remove();  // Eliminamos del DOM el último elemento
collection.length;        // 62 (Cómo el elemento no existe en el DOM, se borra)

// Array
const collection1 = [...document.getElementsByTagName("div")];
collection.length;        // 63
collection[62].remove();  // Eliminamos del DOM el último elemento
collection.length;        // 63 (Sigue teniendo el mismo número de elementos)

// Tambien se puede hacer

const collection2 = Array.from(document.getElementsByTagName("div"));

const elements2 = document.querySelectorAll("div");
elements.map // undefined

const elements3 = [...document.querySelectorAll("div")];
elements.map // ƒ map() { [native code] }

// Si no vas a realizar tareas donde necesites estas estructuras de datos,
// se recomienda no convertirlo en un array, pero si necesitas trabajar con métodos como .map() o .filter(), por ejemplo,
// puedes destructurarlo o convertirlo mediante un Array.from().

