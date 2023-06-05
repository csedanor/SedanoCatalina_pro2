var sedes = {
  "Bogota": {
    nombre: "Pepito Perez",
    correo: "pepitope@prove.com",
    fecha: "15/06/2023"
  },
  "Medellin": {
    nombre: "Juan Ramirez",
    correo: "juanra@prove.com",
    fecha: "20/06/2023"
  },
  "Cali": {
    nombre: "Ana Fernandez",
    correo: "anafer@prove.com",
    fecha: "25/06/2023"
  },
  "Santa Marta": {
    nombre: "Maria Rios",
    correo: "rojasmaria@prove.com",
    fecha: "30/06/2023"
  }
};

var sedeInput = document.getElementById("sede");
var nombreInput = document.getElementById("nombre");
var correoInput = document.getElementById("correo");
var fechaInput = document.getElementById("fecha");

function actualizar() {
  var seleccion = sedeInput.value;
  if (seleccion in sedes) {
    nombreInput.value = sedes[seleccion].nombre;
    correoInput.value = sedes[seleccion].correo;
    fechaInput.value = sedes[seleccion].fecha;
  } else {
    nombreInput.value = "";
    correoInput.value = "";
    fechaInput.value = "";
  }
}

sedeInput.addEventListener("change", actualizar);


