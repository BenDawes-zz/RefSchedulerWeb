
backend = {}
backend.get = function(url, callback = null) {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200 && callback !== null)
            callback(xmlHttp.responseText);
    }
    xmlHttp.open("GET", 'http://localhost:8090/' + url, true); // true for asynchronous
    xmlHttp.send(null);
}