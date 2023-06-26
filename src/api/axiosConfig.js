// exporting axios object for http request   
import axios from "axios";


// baseURL provides base address for api and points that are client react app will be calling 
// so that we dont need to repeat baseURL for each http request
// headers is needed as technology needed during development is negrok, i.e. 
// so that client http req not be blocked by cors (cross origion resource sharing)
// and access the resource available by the api
export default axios.create({
    baseURL: "http://localhost:8080/",
    headers: {"negrok-skip-browser-warning": "true"}
});
