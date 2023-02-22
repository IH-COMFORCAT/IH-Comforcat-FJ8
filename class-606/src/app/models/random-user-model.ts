
export interface RandomUserResponse {
    results: RandomUserModel[];
}

export interface RandomUserModel {

    name: Name;
    dob: {
        age: number
    }
    location: {
        country: string
    }

    picture: {
        medium: string
    }

}

export interface Name {
    title: string;
    first: string;
    last: string;
}
