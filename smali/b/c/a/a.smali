.class public final enum Lb/c/a/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb/c/a/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lb/c/a/a;

.field public static final enum d:Lb/c/a/a;

.field public static final enum e:Lb/c/a/a;

.field public static final enum f:Lb/c/a/a;

.field private static final synthetic g:[Lb/c/a/a;


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lb/c/a/a;

    const/4 v1, 0x0

    const-string v2, "INVALID_REQUEST"

    const-string v3, "Invalid Ad request."

    invoke-direct {v0, v2, v1, v3}, Lb/c/a/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb/c/a/a;->c:Lb/c/a/a;

    new-instance v0, Lb/c/a/a;

    const/4 v2, 0x1

    const-string v3, "NO_FILL"

    const-string v4, "Ad request successful, but no ad returned due to lack of ad inventory."

    invoke-direct {v0, v3, v2, v4}, Lb/c/a/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb/c/a/a;->d:Lb/c/a/a;

    new-instance v0, Lb/c/a/a;

    const/4 v3, 0x2

    const-string v4, "NETWORK_ERROR"

    const-string v5, "A network error occurred."

    invoke-direct {v0, v4, v3, v5}, Lb/c/a/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb/c/a/a;->e:Lb/c/a/a;

    new-instance v0, Lb/c/a/a;

    const/4 v4, 0x3

    const-string v5, "INTERNAL_ERROR"

    const-string v6, "There was an internal error."

    invoke-direct {v0, v5, v4, v6}, Lb/c/a/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb/c/a/a;->f:Lb/c/a/a;

    const/4 v5, 0x4

    new-array v5, v5, [Lb/c/a/a;

    sget-object v6, Lb/c/a/a;->c:Lb/c/a/a;

    aput-object v6, v5, v1

    sget-object v1, Lb/c/a/a;->d:Lb/c/a/a;

    aput-object v1, v5, v2

    sget-object v1, Lb/c/a/a;->e:Lb/c/a/a;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Lb/c/a/a;->g:[Lb/c/a/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb/c/a/a;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/c/a/a;
    .locals 1

    const-class v0, Lb/c/a/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb/c/a/a;

    return-object p0
.end method

.method public static values()[Lb/c/a/a;
    .locals 1

    sget-object v0, Lb/c/a/a;->g:[Lb/c/a/a;

    invoke-virtual {v0}, [Lb/c/a/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/c/a/a;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb/c/a/a;->b:Ljava/lang/String;

    return-object v0
.end method
