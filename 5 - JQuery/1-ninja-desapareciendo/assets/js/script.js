$(function () {
    $('img').click(function () {
        $(this).fadeOut();
    });

    $('#btnRetaurar').click(function () {
        $('img').fadeIn();
    });
})