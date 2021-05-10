function funcNoCopy() {
    $('.panelNoCopy').bind('copy paste', function (e) {
        e.preventDefault();
        return false;
    });
}


function cientoveintinueve() {

    $.ajax({
        url: "view/cientoveintinueve.html",
        async: true,
        dataType: "html",
        type: "GET",
        error: function () {
            alert("Se a producido un error");
        },
        complete: function () {
            $('#main-menu').removeClass("mobile-is-visible");

            $('#cientoveintinueve').addClass("active");

            funcNoCopy();
        },
        success: function (html) {
            $('#navegacionAjax').html("");
            $('#navegacionAjax').html(html);
            $('.abierto').removeClass("active");

        }
    });
}


function cientouno() {
    $.ajax({
        url: "view/cientouno.jsp",
        async: true,
        dataType: "html",
        type: "GET",
        error: function () {
            alert("Se a producido un error");
        },
        complete: function () {
            $('#main-menu').removeClass("mobile-is-visible");
            $('#cientouno').addClass("active");

            $('#navegacionAjax').addClass("colorBordeLeftEyL");

            funcNoCopy();
        },
        success: function (html) {
            $('#navegacionAjax').html("");
            $('#navegacionAjax').html(html);
            $('.abierto').removeClass("active");

            $('#navegacionAjax').removeClass("colorBordeLeftCyQ");
            $('#navegacionAjax').removeClass("colorBordeLeftEyL");
            $('#navegacionAjax').removeClass("colorBordeLeftPyC");
        }
    });
}

