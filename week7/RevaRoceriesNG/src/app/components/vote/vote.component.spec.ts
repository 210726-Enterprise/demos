import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoteComponent } from './vote.component';

fdescribe('VoteComponent', () => {
  let component: VoteComponent;
  let fixture: ComponentFixture<VoteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [VoteComponent],
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoteComponent);
    component = fixture.componentInstance; // storing a component instance that we can utilize to make calls
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should increment vote count to 1 when upVote() is invoked', () => {
    component.upVote();
    expect(component.voteCount).toBe(1);
  });

  it('should decrement vote count to -1 when downVote() is invoked', () => {
    component.downVote();
    expect(component.voteCount).toBe(-1);
  });
});
