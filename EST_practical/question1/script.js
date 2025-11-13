const hamburger = document.getElementById("hamburger");
const navLinks = document.getElementById("navLinks");
const content = document.getElementById("content");

hamburger.addEventListener("click", () => {
  navLinks.classList.toggle("open");
});


document.querySelector('a[href="#"]').addEventListener("click", (e) => {
  e.preventDefault();
  content.textContent = "You are on the Home page";
});

document.querySelector('a[href="#about"]').addEventListener("click", (e) => {
  e.preventDefault();
  content.textContent = "This is the About page";
});


document.querySelector('a[href="#contact"]').addEventListener("click", (e) => {
  e.preventDefault();
  content.textContent = "This is the Contact page";
});
