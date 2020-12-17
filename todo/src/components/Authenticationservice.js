class Authenticateservice{
    registeruser(username,password){
        console.log("login successfull")
        sessionStorage.setItem("Authenticateduser", username)
    }

    logoutuser(){
        console.log("Session storage is clear")
        sessionStorage.removeItem("Authenticateduser")
    }
    islogined(){
        let user=sessionStorage.getItem("Authenticateduser")
        if(user===null)return false;
        else
        return true

    }
    username(){
        let user=sessionStorage.getItem("Authenticateduser")
        if(user===null)return "";
        else
        return user;

        
    }

}
export default new Authenticateservice;