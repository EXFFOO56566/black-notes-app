.class public final enum Lnotepad/note/notas/notes/notizen/main/MainActivity$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/main/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnotepad/note/notas/notes/notizen/main/MainActivity$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

.field public static final enum c:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

.field public static final enum d:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

.field private static final synthetic e:[Lnotepad/note/notas/notes/notizen/main/MainActivity$c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    const/4 v1, 0x0

    const-string v2, "TITLE"

    invoke-direct {v0, v2, v1}, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->b:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    const/4 v2, 0x1

    const-string v3, "EDITED_TIME"

    invoke-direct {v0, v3, v2}, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->c:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    const/4 v3, 0x2

    const-string v4, "CREATED_TIME"

    invoke-direct {v0, v4, v3}, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->d:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    const/4 v4, 0x3

    new-array v4, v4, [Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    sget-object v5, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->b:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    aput-object v5, v4, v1

    sget-object v1, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->c:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->e:[Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

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

.method public static valueOf(Ljava/lang/String;)Lnotepad/note/notas/notes/notizen/main/MainActivity$c;
    .locals 1

    const-class v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    return-object p0
.end method

.method public static values()[Lnotepad/note/notas/notes/notizen/main/MainActivity$c;
    .locals 1

    sget-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->e:[Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    invoke-virtual {v0}, [Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    return-object v0
.end method
