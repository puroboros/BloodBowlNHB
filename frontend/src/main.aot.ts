import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModuleNgFactory } from '../aot/app/app.module';

//styles used
require('./app/assets/css/main.css');
require('./app/assets/css/bootstrap.min.css');


platformBrowserDynamic().bootstrapModule(AppModuleNgFactory);
