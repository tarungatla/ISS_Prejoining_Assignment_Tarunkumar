    function validateLogin() {
    var username = document.getElementById("username").value.trim();
    var password = document.getElementById("password").value.trim();

    if (username === "") {
        alert("Username cannot be empty!");
        return false;
    }
    if (password === "") {
        alert("Password cannot be empty!");
        return false;
    }
    if (password.length < 6) {
        alert("Password must be at least 6 characters!");
        return false;
    }
    return true;
}

function validateRegister() {
    var username = document.getElementById("reg_username").value.trim();
    var password = document.getElementById("reg_password").value.trim();
    var confirm  = document.getElementById("reg_confirm").value.trim();

    if (username === "") {
        alert("Username cannot be empty!");
        return false;
    }
    if (username.length < 3) {
        alert("Username must be at least 3 characters!");
        return false;
    }
    if (password === "") {
        alert("Password cannot be empty!");
        return false;
    }
    if (password.length < 6) {
        alert("Password must be at least 6 characters!");
        return false;
    }
    if (password !== confirm) {
        alert("Passwords do not match!");
        return false;
    }
    return true;
}