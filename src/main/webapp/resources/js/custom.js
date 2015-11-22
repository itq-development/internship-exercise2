
// Mask for the "textarea"; with it we can only enter numbers
jQuery(document).ready(function() {
    jQuery('.form-control').keypress(function(key) {
        if(key.charCode < 48 || key.charCode > 57) return false;
    });
});