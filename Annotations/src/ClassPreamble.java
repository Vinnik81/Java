public @interface ClassPreamble {
String author();
String date();
String[] reviewers();
int currentRevision() default 1;
String lastModified() default "no date";
String lastModifiedBy() default "no date";
}
