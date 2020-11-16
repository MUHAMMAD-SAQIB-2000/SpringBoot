$(".services").owlCarousel({
  margin:20,
  loop:true,
  autoplay:true,
  autoplayTimeout:2000,
  autoplayHoverPause:true,
  responsive:{
    0:{
      items:1
    },
    600:{
      items:2
    },
    1000:{
      items:3
    }
  }
});
function showSearchBar() {
  let search = document.getElementById("search");
  if(search.className != "active"){
    search.className="active";
  }else if(search.className != "hidden"){
    search.className="hidden";
  }
}
