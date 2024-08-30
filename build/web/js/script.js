function getRequest() {

    fetch("getRequest?name=ishan").then(
            response => {
                if (response.ok) {
                    return response.text();
                } else {
                    throw new Error("Response Error");
                }
            }
    ).then(
            text => {
                console.log(text);
            }
    ).catch(
            error => {
                console.log(error);
            }
    );
}
function postRequest() {

    var data = {
        name: "Ishan",
    }

    fetch("postRequest", {
        method: "POST",
        body: JSON.stringify(data),
        headers: {
            "Content-Type": "application/json"
        }
    }
    ).then(
            response => {
                if (response.ok) {
                    return response.text();
                } else {
                    throw new Error("Response Error");
                }
            }
    ).then(
            text => {
                console.log(text);
            }
    ).catch(
            error => {
                console.log(error);
            }
    );
}
async function postRequest() {

    const  data = {
        name: "Ishan"
    };

    const response = await fetch("postRequest", {
        method: "POST",
        body: JSON.stringify(data),
        headers: {
            "Content-Type": "application/json"
        }
    });
    if (response.ok) {
        const json = await response.json();
        console.log(json.name);
        console.log(json.country);
    } else {
        console.log("Response error");
    }
}