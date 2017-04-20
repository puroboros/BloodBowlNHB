export class Page<T> {
    content: T[];
    totalPages: number;
    totalElements: number;
    last: boolean;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    sort: {direction, property, ignoreCase, nullHandling, ascending, descending};
}
