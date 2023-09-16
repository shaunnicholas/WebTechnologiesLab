function validateFileInput() 
{
    const fileInput = document.getElementById('myfile');
    const errorDisplay = document.getElementById('errorDisplay');
    errorDisplay.innerHTML = '';
    if (fileInput.files.length === 0) 
    {
        errorDisplay.innerHTML = '<p class="error">Please select a file.</p>';
        return false;
    }
    return true;
}