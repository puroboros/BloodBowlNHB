import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';

//styles used
require('./app/assets/css/main.css');
require('./app/assets/css/bootstrap.min.css');
require('./app/assets/font/opensans/opensans-regular.ttf');


platformBrowserDynamic().bootstrapModule(AppModule);
