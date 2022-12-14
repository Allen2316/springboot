// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){
    const request = await fetch("api/usuarios",{
    method: "GET",
    headers: {
        "Accept" : "application/json",
        "Content-Type": "application/json"
    }
    });

    const usuarios = await request.json();

    let usuarioHtml = "";   

    for(let usuario of usuarios ){
        usuarioHtml += `
                <tr>
                  <td>${usuario.id}</td>
                  <td>${usuario.nombre} ${usuario.apellido}</td>
                  <td>${usuario.email}</td>
                  <td>${usuario.telefono}</td>
                  <td>${usuario.password}</td>
                  <td>
                    <a href="#" class="btn btn-danger btn-circle btn-sm">
                    <i class="fas fa-trash"></i>
                    </a>
                  </td>
                </tr>
        `;
    }

    
    

    document.querySelector("#usuarios tbody").outerHTML = usuarioHtml;
}


