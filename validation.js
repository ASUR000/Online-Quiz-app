document.getElementById('registrationForm').addEventListener('submit', function (event) {
    // Retrieve form field values
    const username = document.querySelector('input[name="username"]').value.trim();
    const email = document.querySelector('input[name="email"]').value.trim();
    const password = document.querySelector('input[name="password"]').value.trim();

    // Regular expression for email validation
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    // Validation Flags
    let isValid = true;
    let errorMessage = '';

    // Validate username
    if (username === '') {
        isValid = false;
        errorMessage += 'Username cannot be empty.\n';
    }

    // Validate email
    if (email === '') {
        isValid = false;
        errorMessage += 'Email cannot be empty.\n';
    } else if (!emailRegex.test(email)) {
        isValid = false;
        errorMessage += 'Invalid email format.\n';
    }

    // Validate password
    if (password === '') {
        isValid = false;
        errorMessage += 'Password cannot be empty.\n';
    } else if (password.length < 6) {
        isValid = false;
        errorMessage += 'Password must be at least 6 characters long.\n';
    } else if (!/[A-Z]/.test(password)) {
        isValid = false;
        errorMessage += 'Password must contain at least one uppercase letter.\n';
    } else if (!/[a-z]/.test(password)) {
        isValid = false;
        errorMessage += 'Password must contain at least one lowercase letter.\n';
    } else if (!/[0-9]/.test(password)) {
        isValid = false;
        errorMessage += 'Password must contain at least one number.\n';
    } else if (!/[!@#$%^&*]/.test(password)) {
        isValid = false;
        errorMessage += 'Password must contain at least one special character (!@#$%^&*).\n';
    }

    // If validation fails, prevent form submission and show error messages
    if (!isValid) {
        alert(errorMessage);
        event.preventDefault(); // Prevent form submission
    }
});
