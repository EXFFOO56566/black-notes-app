.class public final enum Lb/b/a/b/a/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb/b/a/b/a/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lb/b/a/b/a/a;

.field public static final enum c:Lb/b/a/b/a/a;

.field public static final enum d:Lb/b/a/b/a/a;

.field public static final enum e:Lb/b/a/b/a/a;

.field public static final enum f:Lb/b/a/b/a/a;

.field public static final enum g:Lb/b/a/b/a/a;

.field public static final enum h:Lb/b/a/b/a/a;

.field public static final enum i:Lb/b/a/b/a/a;

.field private static final synthetic j:[Lb/b/a/b/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lb/b/a/b/a/a;

    const/4 v1, 0x0

    const-string v2, "NO_HARDWARE"

    invoke-direct {v0, v2, v1}, Lb/b/a/b/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/a;->b:Lb/b/a/b/a/a;

    new-instance v0, Lb/b/a/b/a/a;

    const/4 v2, 0x1

    const-string v3, "HARDWARE_UNAVAILABLE"

    invoke-direct {v0, v3, v2}, Lb/b/a/b/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/a;->c:Lb/b/a/b/a/a;

    new-instance v0, Lb/b/a/b/a/a;

    const/4 v3, 0x2

    const-string v4, "NO_FINGERPRINTS_REGISTERED"

    invoke-direct {v0, v4, v3}, Lb/b/a/b/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/a;->d:Lb/b/a/b/a/a;

    new-instance v0, Lb/b/a/b/a/a;

    const/4 v4, 0x3

    const-string v5, "SENSOR_FAILED"

    invoke-direct {v0, v5, v4}, Lb/b/a/b/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/a;->e:Lb/b/a/b/a/a;

    new-instance v0, Lb/b/a/b/a/a;

    const/4 v5, 0x4

    const-string v6, "LOCKED_OUT"

    invoke-direct {v0, v6, v5}, Lb/b/a/b/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/a;->f:Lb/b/a/b/a/a;

    new-instance v0, Lb/b/a/b/a/a;

    const/4 v6, 0x5

    const-string v7, "TIMEOUT"

    invoke-direct {v0, v7, v6}, Lb/b/a/b/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/a;->g:Lb/b/a/b/a/a;

    new-instance v0, Lb/b/a/b/a/a;

    const/4 v7, 0x6

    const-string v8, "AUTHENTICATION_FAILED"

    invoke-direct {v0, v8, v7}, Lb/b/a/b/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/a;->h:Lb/b/a/b/a/a;

    new-instance v0, Lb/b/a/b/a/a;

    const/4 v8, 0x7

    const-string v9, "UNKNOWN"

    invoke-direct {v0, v9, v8}, Lb/b/a/b/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/a;->i:Lb/b/a/b/a/a;

    const/16 v9, 0x8

    new-array v9, v9, [Lb/b/a/b/a/a;

    sget-object v10, Lb/b/a/b/a/a;->b:Lb/b/a/b/a/a;

    aput-object v10, v9, v1

    sget-object v1, Lb/b/a/b/a/a;->c:Lb/b/a/b/a/a;

    aput-object v1, v9, v2

    sget-object v1, Lb/b/a/b/a/a;->d:Lb/b/a/b/a/a;

    aput-object v1, v9, v3

    sget-object v1, Lb/b/a/b/a/a;->e:Lb/b/a/b/a/a;

    aput-object v1, v9, v4

    sget-object v1, Lb/b/a/b/a/a;->f:Lb/b/a/b/a/a;

    aput-object v1, v9, v5

    sget-object v1, Lb/b/a/b/a/a;->g:Lb/b/a/b/a/a;

    aput-object v1, v9, v6

    sget-object v1, Lb/b/a/b/a/a;->h:Lb/b/a/b/a/a;

    aput-object v1, v9, v7

    aput-object v0, v9, v8

    sput-object v9, Lb/b/a/b/a/a;->j:[Lb/b/a/b/a/a;

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

.method public static valueOf(Ljava/lang/String;)Lb/b/a/b/a/a;
    .locals 1

    const-class v0, Lb/b/a/b/a/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb/b/a/b/a/a;

    return-object p0
.end method

.method public static values()[Lb/b/a/b/a/a;
    .locals 1

    sget-object v0, Lb/b/a/b/a/a;->j:[Lb/b/a/b/a/a;

    invoke-virtual {v0}, [Lb/b/a/b/a/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/b/a/b/a/a;

    return-object v0
.end method
