import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'nameFormat',
  standalone: false
})
export class NameFormatPipe implements PipeTransform {

  transform(value: string, args: string): string {
    if(args == 'Male') return 'Mr. '+value;
    else if(args == 'Female') return 'Ms. '+value;
    else return value;
  }

}
