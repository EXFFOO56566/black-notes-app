.class public final enum La/k/b/c$g;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/k/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/k/b/c$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:La/k/b/c$g;

.field public static final enum c:La/k/b/c$g;

.field public static final enum d:La/k/b/c$g;

.field private static final synthetic e:[La/k/b/c$g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, La/k/b/c$g;

    const/4 v1, 0x0

    const-string v2, "PENDING"

    invoke-direct {v0, v2, v1}, La/k/b/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/k/b/c$g;->b:La/k/b/c$g;

    new-instance v0, La/k/b/c$g;

    const/4 v2, 0x1

    const-string v3, "RUNNING"

    invoke-direct {v0, v3, v2}, La/k/b/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/k/b/c$g;->c:La/k/b/c$g;

    new-instance v0, La/k/b/c$g;

    const/4 v3, 0x2

    const-string v4, "FINISHED"

    invoke-direct {v0, v4, v3}, La/k/b/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/k/b/c$g;->d:La/k/b/c$g;

    const/4 v4, 0x3

    new-array v4, v4, [La/k/b/c$g;

    sget-object v5, La/k/b/c$g;->b:La/k/b/c$g;

    aput-object v5, v4, v1

    sget-object v1, La/k/b/c$g;->c:La/k/b/c$g;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, La/k/b/c$g;->e:[La/k/b/c$g;

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

.method public static valueOf(Ljava/lang/String;)La/k/b/c$g;
    .locals 1

    const-class v0, La/k/b/c$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/k/b/c$g;

    return-object p0
.end method

.method public static values()[La/k/b/c$g;
    .locals 1

    sget-object v0, La/k/b/c$g;->e:[La/k/b/c$g;

    invoke-virtual {v0}, [La/k/b/c$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/k/b/c$g;

    return-object v0
.end method
