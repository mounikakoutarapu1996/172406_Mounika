import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PuppydetailsComponent } from './puppydetails.component';

describe('PuppydetailsComponent', () => {
  let component: PuppydetailsComponent;
  let fixture: ComponentFixture<PuppydetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PuppydetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PuppydetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
