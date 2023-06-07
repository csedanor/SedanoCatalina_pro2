 
    var sedes = {
      "Bogota": {
        "Categorías": ["-Escoger categoria-", "Belleza", "Farmacia", "Maternidad y bebés", "Cuidado y aseo personal", "Dermocosmetica", "Alimentos y bebidas"],
        "Productos": {
          "Belleza": [{ nombre: "-Escoger producto-"},{ nombre: "Crema Humectante", precio: "$11.100"}],
          "Farmacia": [{ nombre: "-Escoger producto-"},{nombre: "Acetaminofen", precio: "1.800" }, { nombre: "Vitamina C", precio: "$3.400" }],
          "Maternidad y bebés": [{ nombre: "-Escoger producto-"},{ nombre: "Crema numero 4", precio: "$35.700" }, {nombre: "Toallitas arruru", precio: "$10.200"}],
          "Cuidado y aseo personal": [ { nombre: "-Escoger producto-"},{ nombre: "Repelente repeblack", precio: "13.000" }],
          "Dermocosmetica": [{ nombre: "-Escoger producto-"},{ nombre: "Cetaphi crema humectante", precio: "$76.680" }],
          "Alimentos y bebidas": [{ nombre: "-Escoger producto-"},{ nombre: "Helado Artesanal", precio: "$2.100" }, { nombre: "Agua brisa", precio: "$7.650" }]
        }
      },
      "Medellin": {
          "Categorías": ["Belleza", "Farmacia", "Maternidad y bebés", "Cuidado y aseo personal", "Alimentos y bebidas", "Para el hogar"],
        "Productos": {
          "Belleza": [{ nombre: "-Escoger producto-"},{ nombre: "Esmalte", precio:  "$5200"}],
          "Farmacia": [{ nombre: "-Escoger producto-"},{ nombre: "Dolicox", precio: "$49.800"}, { nombre: "Vitamina C", precio: "$3.400" }],
          "Maternidad y bebés": [{ nombre: "-Escoger producto-"},{ nombre: "Pañales pampers", precio: "$61.000"}, { nombre: "Locion arruru", precio: "$36.000" }],
          "Cuidado y aseo personal": [{ nombre: "-Escoger producto-"},{ nombre: "Desodorante yodora", precio: "$36.000" }, { nombre: "Minoxidil", precio: "$31.050"}],
          "Alimentos y bebidas": [{ nombre: "-Escoger producto-"},{ nombre: "Choco cono", precio: "$2.000" }, { nombre: "Coca cola", precio: "$5.600" }],
          "Para el hogar": [{ nombre: "-Escoger producto-"},{ nombre: "Papel higienico", precio: "$10.100" }]
        }
      },
      "Cali": {
        "Categorías": ["Farmacia", "Maternidad y bebés", "Cuidado y aseo personal","Alimentos y bebidas", "Para el hogar"],
        "Productos": {
          "Farmacia": [{ nombre: "-Escoger producto-"},{ nombre: "Betametasona", precio: "$6.000" }, { nombre: "Noraver", precio: "$5.050" }],
          "Maternidad y bebés": [{ nombre: "-Escoger producto-"},{ nombre: "Jabon tersura avena", precio: "$6.400" }, { nombre: "Talco tersura", precio: "$16.000" }],
          "Cuidado y aseo personal": [{ nombre: "-Escoger producto-"},{ nombre: "Talco cosmetico", precio: "$24.800" }, { nombre: "Aceite de argan", precio: "$8.9510" }],
          "Alimentos y bebidas": [{ nombre: "Gatorade", precio: "$3.500" }, { nombre: "Cheetos", precio: "$1.800" }],
          "Para el hogar": [{ nombre: "-Escoger producto-"},{ nombre: "Clorox", precio: "$2.200" }]
        }
      },
      "Santa Marta": {
        "Categorías": [ "Farmacia", "Maternidad y bebés", "Cuidado y aseo personal", "Dermocosmetica", "Alimentos y bebidas", "Para el hogar"],
        "Productos": {
          "Farmacia": [{ nombre: "-Escoger producto-"},{ nombre: "Mixato", precio: "$ 89.950" }, { nombre: "Mieltertos", precio: "$2.800" }],
          "Maternidad y bebés": [{ nombre: "-Escoger producto-"},{ nombre: "Nan supreme 1", precio: "$76.500" }],
          "Cuidado y aseo personal": [{ nombre: "-Escoger producto-"},{ nombre: "Cepillo dental", precio: "$3.350" }],
          "Dermocosmetica": [{ nombre: "-Escoger producto-"},{ nombre: "Locion Eurecin", precio: "$121.000" }],
          "Alimentos y bebidas": [{ nombre: "-Escoger producto-"},{ nombre: "Ponque bombo", precio: "$4.800" }],
          "Para el hogar": [{ nombre: "-Escoger producto-"},{ nombre: "Servilletas", precio: "$5.200" }]
        }
      }
      
      };
     var sedeInput = document.getElementById("sede");
    var categoriaInput = document.getElementById("categoria");
    var productoInput = document.getElementById("producto");
    var precioInput = document.getElementById("precio");

    function actualizarCategorias() {
      var seleccionSede = sedeInput.value;
      var categorias = sedes[seleccionSede]["Categorías"];

      categoriaInput.innerHTML = "";
      productoInput.innerHTML = "";
      precioInput.value = "";

      categorias.forEach(function (categoria) {
        var option = document.createElement("option");
        option.value = categoria;
        option.textContent = categoria;
        categoriaInput.appendChild(option);
      });
    }

    function actualizarProductos() {
      var seleccionSede = sedeInput.value;
      var seleccionCategoria = categoriaInput.value;
      var productos = sedes[seleccionSede]["Productos"][seleccionCategoria];

      productoInput.innerHTML = "";
      precioInput.value = "";

      productos.forEach(function (producto) {
        var option = document.createElement("option");
        option.value = producto.nombre;
        option.textContent = producto.nombre;
        productoInput.appendChild(option);
      });
    }

    function actualizarPrecio() {
      var seleccionSede = sedeInput.value;
      var seleccionCategoria = categoriaInput.value;
      var seleccionProducto = productoInput.value;
      var precio = sedes[seleccionSede]["Productos"][seleccionCategoria].find(function (producto) {
        return producto.nombre === seleccionProducto;
      }).precio;
      precioInput.value = precio;
    }

    sedeInput.addEventListener("change", actualizarCategorias);
    categoriaInput.addEventListener("change", actualizarProductos);
    productoInput.addEventListener("change", actualizarPrecio);

    actualizarCategorias();
    actualizarProductos();
    actualizarPrecio();
