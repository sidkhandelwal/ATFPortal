$(function() {
	$(document).on('focusin', '.field, textarea', function() {
		if(this.title==this.value) {
			this.value = '';
		}
	}).on('focusout', '.field, textarea', function(){
		if(this.value=='') {
			this.value = this.title;
		}
	});

	$('#navigation ul li:first-child').addClass('first');
	$('.footer-nav ul li:first-child').addClass('first');

	$('#navigation a.nav-btn').click(function(){
		$(this).closest('#navigation').find('ul').slideToggle()
		$(this).find('span').toggleClass('active')
		return false;
	});
	
	$('.logout').confirm({
	    text: "Are you sure you want to delete that comment?",
	    title: "Confirmation required",
	    confirm: function(button) {
	        // do something
	    },
	    cancel: function(button) {
	        // do something
	    },
	    confirmButton: "Yes I am",
	    cancelButton: "No",
	    post: true
	});
});
