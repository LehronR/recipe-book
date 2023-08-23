const btn = document.getElementById('testBtn');
const btnContainer = document.getElementById('btnContainer');

const createNewEl = (btn) => {
    const input = document.createElement('input');
    btnContainer.appendChild(input);
}

btn.addEventListener('click', createNewEl);