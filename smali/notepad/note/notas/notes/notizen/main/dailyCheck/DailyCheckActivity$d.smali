.class final enum Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

.field public static final enum c:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

.field private static final synthetic d:[Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    const/4 v1, 0x0

    const-string v2, "TODO"

    invoke-direct {v0, v2, v1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    const/4 v2, 0x1

    const-string v3, "SHOPPING"

    invoke-direct {v0, v3, v2}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->c:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    const/4 v3, 0x2

    new-array v3, v3, [Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    sget-object v4, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->d:[Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;
    .locals 1

    const-class v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    return-object p0
.end method

.method public static values()[Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;
    .locals 1

    sget-object v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->d:[Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    invoke-virtual {v0}, [Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    return-object v0
.end method
