$(window).scroll(function() {
	console.log($(document).scrollTop())
  if ($(document).scrollTop() > 900) {

    $('nav').addClass('shrink');
  } else {
    $('nav').removeClass('shrink');
  }
});