import { TestBed, async } from '@angular/core/testing';
import { welcomeComponent } from './welcome.component';
describe('welcomeComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        welcomeComponent
      ],
    }).compileComponents();
  }));
  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(welcomeComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));
  it(`should have as title 'welcome-app'`, async(() => {
    const fixture = TestBed.createComponent(welcomeComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('welcome-app');
  }));
  it('should render title in a h1 tag', async(() => {
    const fixture = TestBed.createComponent(welcomeComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to welcome-app!');
  }));
});
