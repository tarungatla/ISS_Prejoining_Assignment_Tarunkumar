function validateForm() {
  const name = document.getElementById("fullname").value.trim();
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value.trim();
  const termsAccepted = document.getElementById("terms").checked;

  const messages = [];

  if (name === "") {
    messages.push("Name is required.");
  }

  const emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,}$/;
  if (!emailPattern.test(email)) {
    messages.push("Enter a valid email.");
  }

  if (password.length < 6) {
    messages.push("Password must be at least 6 characters.");
  }

  if (!termsAccepted) {
    messages.push("You must accept the terms.");
  }

  if (messages.length > 0) {
    alert(messages.join("\n"));
    return false;
  }

  return true;
}