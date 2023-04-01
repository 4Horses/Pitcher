export class Project {
  constructor(
    public name: string,
    public progress: number,
    public description: string,
    public isHovered = false
  ) {}
}
