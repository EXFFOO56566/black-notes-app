.class public final enum Lb/c/a/b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb/c/a/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lb/c/a/b;

.field public static final enum c:Lb/c/a/b;

.field public static final enum d:Lb/c/a/b;

.field private static final synthetic e:[Lb/c/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lb/c/a/b;

    const/4 v1, 0x0

    const-string v2, "UNKNOWN"

    invoke-direct {v0, v2, v1}, Lb/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/c/a/b;->b:Lb/c/a/b;

    new-instance v0, Lb/c/a/b;

    const/4 v2, 0x1

    const-string v3, "MALE"

    invoke-direct {v0, v3, v2}, Lb/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/c/a/b;->c:Lb/c/a/b;

    new-instance v0, Lb/c/a/b;

    const/4 v3, 0x2

    const-string v4, "FEMALE"

    invoke-direct {v0, v4, v3}, Lb/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/c/a/b;->d:Lb/c/a/b;

    const/4 v4, 0x3

    new-array v4, v4, [Lb/c/a/b;

    sget-object v5, Lb/c/a/b;->b:Lb/c/a/b;

    aput-object v5, v4, v1

    sget-object v1, Lb/c/a/b;->c:Lb/c/a/b;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lb/c/a/b;->e:[Lb/c/a/b;

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

.method public static valueOf(Ljava/lang/String;)Lb/c/a/b;
    .locals 1

    const-class v0, Lb/c/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb/c/a/b;

    return-object p0
.end method

.method public static values()[Lb/c/a/b;
    .locals 1

    sget-object v0, Lb/c/a/b;->e:[Lb/c/a/b;

    invoke-virtual {v0}, [Lb/c/a/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/c/a/b;

    return-object v0
.end method
