/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function consultacinema(){
    $.ajax({
        url:"http://localhost:8080/api/Cinema/all",
        type:"GET",
        datatype:"JSON",
        success:function(respuesta){
            console.log(respuesta);
            pintarRespuesta(respuesta.items)
        }
        
    });
}
function pintarRespuesta(items){

    let myTable="<table>";
    for(i=0;i<items.length;i++){
        myTable+="<tr>";
        myTable+="<td>"+items[i].id+"</td>";
        myTable+="<td>"+items[i].owner+"</td>";
        myTable+="<td>"+items[i].capacity+"</td>";
        myTable+="<td>"+items[i].category_id+"</td>";
        myTable+="<td>"+items[i].name+"</td>";
        myTable+="</td>";
    }
}
