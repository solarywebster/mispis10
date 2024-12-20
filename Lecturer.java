package ru.vsu.cs.bazhanov.classes;

public class Lecturer extends ResearchAssociate {

	private Course[] courses;

	public Lecturer(int ssNo, String name, String fieldOfStudy) {
		super(ssNo, name, fieldOfStudy);
	}

	public Course[] getCourses() {
		return this.courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public void addCourse(Course course) {
		// TODO - implement Lecturer.addCourse
		throw new UnsupportedOperationException();
	}

	public void removeCourse(Course course) {
		// TODO - implement Lecturer.removeCourse
		throw new UnsupportedOperationException();
	}

}