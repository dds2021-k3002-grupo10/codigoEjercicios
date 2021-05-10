var mensajeError = '<div class="alert alert-danger"><strong>!</strong> Ocurrio un error en la busqueda.</div>';
var mensajeSinDatos = '<div class="alert alert-info"> No se encontr&oacute datos en la busqueda.</div>'
var mensajeFormVacio = '<div class="alert alert-white">Ingrese datos en el formulario para hacer una busqueda.</div>'

function buscarConEnter(e) {
    var enter = e.keyCode || e.which;
    if (enter == 13) {
        busquedaPersona();
    }
}

$('.solo-numero').keyup(function () {
    this.value = (this.value + '').replace(/[^0-9]/g, '');
});



function formEstaVacio() {
    var cont = 0
     var contcheckbox = 0
    $("#form input").each(function (index, element) {
        if ($(element).val().length > 0) {
            cont = cont + 1;
        }
    });

 $('input[type=checkbox]').on('change', function() {
    if ($(this).is(':checked') ) {
       contcheckbox = contcheckbox + 1;
    } 
});
    if (cont > 0 && contcheckbox > 1) {
        alert(cont +"-"+contcheckbox);
        return false;
    } else {
        return true;
    }
    ;
}



function calcularPrecios() {



        $.ajax({
            url: "/ejercicios2021/servletTrasporte",
            data: "transportista=" + $('input:radio[name=transportista]:checked').val() + "&tipo=" + $('input:radio[name=tipo]:checked').val() + "&distancia=" + $('#distancia').val() + "&peso=" + $('#peso').val() + "&dummy=" + Math.random(),
            async: true,
            dataType: "html",
            timeout: 60000,
            type: "GET",
            beforeSend: function () {
                $('#mensaje').html("");
                //$('#flotDiv').fadeIn("slow");
            },
            error: function () {
                $('#mensaje').html(mensajeError);
                // $('#flotDiv').fadeOut("slow");
            },
            complete: function () {
            },
            success: function (html) {
                // $('#flotDiv').fadeOut("slow");
                var texto = $.trim($(html).text());
                if (texto == "VACIO") {
                    $('#mensaje').html(mensajeSinDatos);
                } else if (texto == 'ERROR') {
                    $('#mensaje').html(mensajeError);
                } else {
                    // resetformBusqueda();
                    $('#mensaje').html('<div class="alert alert-success">Precio: ' + texto + '$</div>');

                }
            }

        });
   
}








