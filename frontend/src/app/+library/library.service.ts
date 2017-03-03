import { Injectable, EventEmitter } from '@angular/core';
import { Observable } from "rxjs/Rx";
import { RestError } from '../models/rest-error';
import { Http, Response } from '@angular/http';
import { BASE_API_URL } from '../app.properties';
import { Skill } from './skill';
@Injectable()
export class LibraryService{
    private url: string = BASE_API_URL + 'api/v1/abilities';
    constructor(private http: Http) {

    }


    private extractData(res: Response) {
        let body = res.json();
        return body || {};
    }
    private handleError(error: Response | any) {
        // In a real world app, we might use a remote logging infrastructure
        let errMsg: string;
        if (error instanceof Response) {
            const body = error.json() || '';
            const err = body.error || JSON.stringify(body);
            errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
        } else {
            errMsg = error.message ? error.message : error.toString();
        }
        console.error(errMsg);
        return Observable.throw(errMsg);
    }

    findAll(): Promise<Skill[]> {
        return this.http.get(this.url)
            .map(this.extractData)
            .catch(this.handleError).toPromise();
    }

}