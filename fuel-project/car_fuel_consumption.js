if (Meteor.isClient) {

  Template.fuel.rendered = function () {
    Session.set('anAverage', null);
  };

  Template.fuel.helpers({
    anAverage: function () {
      return Session.get('anAverage');
    }
  });

  Template.fuel.events({
    'submit form': function (e) {
      e.preventDefault();

      // Reset alerts
      if ($('.alert').length) {
        $('.alert').remove();
      }

      // Getting data
      var data = {
            fuel: $('#fuel').val().trim(),
            journey: $('#journey').val().trim()
          };

      if (data.fuel && data.journey) {
        var anAverage = data.fuel * (100 / data.journey);
        anAverage = anAverage.toFixed(2);

        Session.set('anAverage', anAverage);
      } else {
        $('form').append('<p class="alert" style="color: red;">Please fill all fields.</p>');
      }
    }
  });
}
