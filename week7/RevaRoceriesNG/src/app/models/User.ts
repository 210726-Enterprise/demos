export class User {

    userId: number;
    username: string;
    password: string;
    firstName: string;
    lastName: string;
    email: string;

    constructor(userId, username, password, firstName, lastName, email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}