/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function leerClientes() {
    //Funcion GET

 $.ajax({
        url: 'api/Client/all',
        type: 'GET',
        dataType: 'json',

        success: function (clientes) {
            let cs = clientes.items;
            $("#listaClientes").empty();
            for (i=0;i<cs.length;i++){
                $("#listaClientes").append("<b>"+cs[i].id +"."+"</b>" +"<b>" + cs[i].name + "</b> " + cs[i].correo);
               $("#listaClientes").append("<button onclick='eliminarCLiente("+cs[i].id+")'>Borrar</button><br>");
            }
        },
        error: function (xhr, status) {
            alert('Ha sucedido un error');
        }


    });
}
function llamarInformacion(){
    $.ajax({
        url:"https://gd8153a19b5daf4-hernanapexbd.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/cinema/cinema",
        type:"GET",
        datatype:"JSON",
        success:function(respuesta){
            console.log(respuesta);
            pintarRespuesta(respuesta.items)
        }
        
    });
}