export class Project{
    id?: number;
    name: string;
    description: string;
    categoryId: number;
    userAccountId: number;
    createdAt: string;
    startDate: number;
    endDate: string;
    isHovered?: boolean;
    progress?: number;
}
