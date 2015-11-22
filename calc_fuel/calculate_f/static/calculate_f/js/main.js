


$(document).ready(function(){

    $('input:radio[name=region]').on('change', function () {
        if ($(this).val() === 'European') {
            $("#s1").text('liters');
            $("#s2").text('km');
        }
        if ($(this).val() === 'US') {
            $("#s1").text('gallon');
            $("#s2").text('miles');
        }
    });



});/*end  ready*/
