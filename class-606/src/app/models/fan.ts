export class Fan {

    constructor(
        private _name: string,
        private _age: number,
        private _country: string,
        private _profilePicture: string = 'http://www.newdesignfile.com/postpic/2009/09/generic-user-profile_354184.png'
    ){}

    get name(): string {
        return this._name;
    }

    get age(): number {
        return this._age;
    }

    get country(): string {
        return this._country;
    }

    get profilePicture(): string {
        return this._profilePicture;
    }

    set name(name: string) {
        this._name = name;
    }

    set age(age: number) {
        this._age = age;
    }

    set country(country: string) {
        this._country = country;
    }

    set profilePicture(profilePicture: string) {
        this._profilePicture = profilePicture;
    }

    

}
