var categorias = {
  "Bebelleza": {
    productos: "Maquillaje - Cuidado facil - Accesorios mujer - Perfumes"
  },
  "Farmaciqa": {
    productos: "Botiquin - Vitaminas y minerales - Dolor e inflamcion - Cuidado de la pies - Formula medica"
  },
  "Maternidad y bebes": {
    productos: "Accesorios - Pañales y pañitos- Formulas infantiles - Cuidado de la colita - Baño del bebe"
  },
  "Cuidado y aseo personal": {
    productos: "Higiene oral- Cuidado capilar - Desodorantes - Proteccion femenina - Solares - Aseo personal"
  },
   "Dermocosmetica": {
    productos: "Rostro - Solares - Corporal - Cuidado capilar"
  },
   "Alimentos y bebidas": {
    productos: "Despensa - Antojos - Desayuno - Lacteos y refrigerados - Frutos secos - Bebidas"
  },
   "Para el hogar": {
    productos: "Papeleria - Limpieza del hogar - Cocina - Cuidado de la ropa - Aseo limpieza para baños"
  }
};

var categoriasInput = document.getElementById("categorias");
var productosInput = document.getElementById("productos");


function actualizarProductos() {
  var seleccion = categoriasInput.value;
  if (seleccion in categorias) {
    productosInput.value = categorias[seleccion].productos;
  } else {
    productosInput.value = "";
  }
}

categoriasInput.addEventListener("change", actualizarProductos);