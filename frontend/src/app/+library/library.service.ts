import { Injectable, EventEmitter } from '@angular/core';
import { Observable } from 'rxjs/Rx';
import { RestError } from '../models/rest-error';
import { Http, Response, RequestOptionsArgs } from '@angular/http';
import { Skill } from './skill';
import { Page } from '../models/page';
import { environment } from '../../environments/environment';
@Injectable()
export class LibraryService{
    private url =  environment.BASE_API_URL + 'api/v1/abilities';
    private skills: Skill[];
    constructor(private http: Http) {

    }

    findAll(): Promise<Page<Skill> > {
        return this.http.get(this.url)
            .map(this.extractData)
            .catch(this.handleError).toPromise();
    }

    private extractData(res: Response) {
        const body = res.json();
        console.log(JSON.stringify(body));
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
        // console.error(errMsg);
        return Observable.throw(errMsg);
    }
}
