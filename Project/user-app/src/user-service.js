export default class UserService {
  authenticate = async (email, password) => {
    try {
      const response = await fetch("http://localhost:8880/admin/login", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          email: email,
          password: password,
        }),
      });

      if (response.ok) {
        const responseBody = await response.json();

        // Save the token in localStorage
        localStorage.setItem("token", responseBody.token);
        return true;
      } else {
        throw new Error("Authentication failed");
      }
    } catch (error) {
      console.log(error);
      return false;
    }
  };

  listUsers = async () => {
    try {
      const response = await fetch("http://localhost:8880/admin/all", {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
          "Authorization": "Bearer " + localStorage.getItem("token"),
        },
      });

      if (response.ok) {
        const responseBody = await response.json();
        return responseBody;
      } else {
        throw new Error("Request failed");
      }
    } catch (error) {
      console.log(error);
    }
  };

  getMovies = async () => {
    try {
      const response = await fetch("http://localhost:8880/movie/all", {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
        },
      });
      if (response.ok) {
        const responseBody = await response.json();
        return responseBody;
      } else {
        throw new Error("Request failed");
      }
    } catch (error) {
      console.log(error);
    }
  };

  getScreens = async () => {
    try {
      const response = await fetch("http://localhost:8880/admin/screen/all", {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
          "Authorization": "Bearer " + localStorage.getItem("token"),
        },
      });
      if (response.ok) {
        const responseBody = await response.json();
        return responseBody;
      } else {
        throw new Error("Request failed");
      }
    } catch (error) {
      console.log(error);
    }
  };
}
