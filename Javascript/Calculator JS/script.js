function submitData(num) {
    var xyz = document.getElementById('fn')
    var lastVal = xyz.value.slice(xyz.value.length - 1)
    var operators = ['*', '/', '-', '+']
    if (operators.indexOf(lastVal) !== -1 && operators.indexOf(num) !== -1) {
        xyz.value = xyz.value.slice(0, - 1) + num
    }
    else {
        xyz.value += num
    }
}

function clearResult() {
    var xyz = document.getElementById('fn')
    xyz.value = ""
}

function getResult() {
    var xyz = document.getElementById('fn')
    xyz.value = eval(xyz.value)
}

function remove() {
    var xyz = document.getElementById('fn')
    xyz.value = xyz.value.slice(0, xyz.value.length - 1)
}




